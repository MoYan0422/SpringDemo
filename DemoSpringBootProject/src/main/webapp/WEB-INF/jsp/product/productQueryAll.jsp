<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
        <!DOCTYPE html>
        <html>

        <head>
            <meta charset="UTF-8">
            <title>Product Query list</title>
            <link rel=styLesheet href="/css/ordersystem.css">
            <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.0/jquery.min.js"></script>
        </head>

        <body>
            <div id="productListTitle">Product Query</div>
            <table id="showproduct" border="1"></table>
            <table>
                <tr>
                    <td>total Pages:${totalPages} Total Records: ${totalElements}</td>
                    <td colspan="3" align="right">Previous
                        <c:forEach var="i" begin="1" end="${totalPages}" step="1">
                            <button id="myPage" value="${i}" onclick="change(${i})">${i}</button>
                        </c:forEach>
                    </td>
                </tr>
            </table>
            <script>
                var indexPage = 1;
                $(function () {
                    loadPage(indexPage);
                })
                function loadPage(indexPage) {
                    $.ajax({
                        type: 'post',
                        url: '/product/querybypage/' + indexPage,
                        dataType: 'JSON',
                        contentType: 'application/json',
                        success: function (data) {
                            $("#showproduct").empty("");

                            if (data == null) {
                                $('table').prepend('<tr><td colspan="2">No data</td></tr>');
                            } else {
                                var table = $("#showproduct");
                                table.append("<tr id='ptitle'><th>ID</th><th>Product Name</th><th>Product Price</th><th>Quantity</th><th>Date</th><th>Note</th></tr>");

                                $.each(data, function (i, n) {
                                    var tr = "<tr align='center'>" + "<td>" + n.pid + "</td>" +
                                        "<td>" + n.pname + "</td>" + "<td>" + n.price + "</td>" + "<td>" + n.quantity + "</td>" +
                                        "<td>" + n.pdate + "</td>" + "<td>" + n.note + "</td>" +
                                        "</tr>";
                                    table.append(tr);
                                });
                            }
                        }

                    })
                }
                function change(index) {
                    indexPage = index;
                    loadPage(index);
                }
            </script>
        </body>

        </html>