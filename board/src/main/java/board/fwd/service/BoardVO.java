package board.fwd.service;

import java.sql.Timestamp;

import lombok.Data;

@Data
public class BoardVO {
    private Long id;
    private String boardWriter;
    private String boardPass;
    private String boardTitle;
    private String boardContents;
    private int boardHits;
    private Timestamp boardCreatedTime;
}
