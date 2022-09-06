package tw.wuyuhsi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tw.wuyuhsi.model.Profiles;
import tw.wuyuhsi.model.ProfilesDao;

@Service
@Transactional
public class ProfilesService {
	@Autowired
	private ProfilesDao profilesDao;

	public ProfilesService() {
		// TODO Auto-generated constructor stub
	}

	public Profiles insert(Profiles profiles) {
		return profilesDao.insert(profiles);
	}

	public Profiles update(Profiles profiles) {
		return profilesDao.update(profiles);
	}

	public Profiles findById(int id) {
		return profilesDao.findById(id);
	}

	public boolean delete(Profiles profiles) {
		return profilesDao.delete(profiles);
	}

}
