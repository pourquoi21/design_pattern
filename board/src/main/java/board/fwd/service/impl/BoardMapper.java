package board.fwd.service.impl;

import board.fwd.service.BoardVO;
import egovframework.rte.psl.dataaccess.mapper.Mapper;

@Mapper
public interface BoardMapper {

    public int save(BoardVO boardVO) throws Exception;
}
