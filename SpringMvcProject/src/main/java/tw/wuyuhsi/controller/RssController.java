package tw.wuyuhsi.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RssController {
	private String result;

	@GetMapping(path = "/ressreader.controller", produces = "application/xml;charset=UTF-8")
	@ResponseBody
	public String processRssAction() throws InterruptedException {
		Thread thread = new Thread() {
			@Override
			public void run() {
				try {
					URL url = new URL("https://www.mohw.gov.tw/rss-16-1.html");
					HttpURLConnection conn = (HttpURLConnection) url.openConnection();
					conn.setRequestMethod("GET");
					conn.setDoInput(true);
					conn.connect();
					BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
					String data = "";
					result = "";
					while ((data = bufferedReader.readLine()) != null) {
						result += data;
					}

					bufferedReader.close();
					conn.disconnect();

				} catch (MalformedURLException e) { // TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		thread.start();
		thread.join();
		System.out.println("result:" + result);
		return result;

	}

}
