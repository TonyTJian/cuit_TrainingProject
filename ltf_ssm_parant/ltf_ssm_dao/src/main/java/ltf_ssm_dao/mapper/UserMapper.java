package ltf_ssm_dao.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface UserMapper {
	@Select("select count(*) from T_User where U_Name=#{Name} and U_PassWord=#{PassWord}")
	int findUserByNameAndPwd(@Param("Name") String Name, @Param("PassWord") String PassWord);
}
