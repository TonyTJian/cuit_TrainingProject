package ltf_ssm_service.ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ltf_ssm_api.service.UserService;
import ltf_ssm_dao.mapper.UserMapper;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;

	@Override
	public boolean login(String name, String pass) {
		int ret = userMapper.findUserByNameAndPwd(name, pass);
		if (ret > 0) {
			return true;
		}
		return false;
	}
}
