package board.fwd.service.impl;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import board.fwd.service.BoardDTO;
import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class BoardRepository {

    private final SqlSessionTemplate sql;

    public int save(BoardDTO boardDTO) throws Exception {
        System.out.println("HELLO FROM REPO");

        //        return sql.insert("boardRepo.save", boardDTO);
        return sql.insert("save", boardDTO);
    }

}
