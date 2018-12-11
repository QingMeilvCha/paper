package com.bishe.mapper;

import com.gkshare.pojo.UserTeam;
import com.gkshare.pojo.UserTeamExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserTeamMapper {
    int countByExample(UserTeamExample example);

    int deleteByExample(UserTeamExample example);

    int deleteByPrimaryKey(Integer userTeamId);

    int insert(UserTeam record);

    int insertSelective(UserTeam record);

    List<UserTeam> selectByExample(UserTeamExample example);

    UserTeam selectByPrimaryKey(Integer userTeamId);

    int updateByExampleSelective(@Param("record") UserTeam record, @Param("example") UserTeamExample example);

    int updateByExample(@Param("record") UserTeam record, @Param("example") UserTeamExample example);

    int updateByPrimaryKeySelective(UserTeam record);

    int updateByPrimaryKey(UserTeam record);
}