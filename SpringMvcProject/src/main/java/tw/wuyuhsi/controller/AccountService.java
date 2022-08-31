package tw.wuyuhsi.controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tw.wuyuhsi.model.Account;
import tw.wuyuhsi.model.AccountDao;


@Service
@Transactional
public class AccountService {
	@Autowired
	private AccountDao accountDao;

	public boolean checkLogin(Account users) {
		return accountDao.checkLogin(users);
	}

}
