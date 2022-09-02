package tw.wuyuhsi.model;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class PictureService {
	
	@Autowired
	private PrictureDao prictureDao;

	public Picture insert(Picture been) {
		return prictureDao.insert(been);
	}
}
