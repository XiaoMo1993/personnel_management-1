package cn.edu.jlu.personnel.management.dao;

import cn.edu.jlu.personnel.management.vo.model.Position;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by nostalie on 17-5-6.
 */
@Repository
public interface PositionDao {

    List<Position> selectPositions();

    int insertPosition(Position position);

    int deletePosition(@Param("name") String name);

    int updatePosition(Position position);
}
