package board.fwd.service.impl;

import org.springframework.stereotype.Service;

import board.fwd.service.BoardService;
import board.fwd.service.BoardVO;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService {

    private final BoardMapper boardMapper;

    @Override
    public int save(BoardVO boardVO) throws Exception {
        return boardMapper.save(boardVO);
    }

}
