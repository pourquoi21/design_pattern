package board.fwd.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import board.fwd.service.BoardService;
import board.fwd.service.BoardVO;
import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
@RequestMapping("/board")
public class BoardController {

    private final BoardService boardService;

    @GetMapping("/save.do")
    public String saveForm() {
        return "board/save";
    }

    @PostMapping("/save.do")
    public String Save(@ModelAttribute BoardVO boardVO) throws Exception {

        System.out.println("HELLO FROM CONTROLLER");

        int saveResult = boardService.save(boardVO);

        if (saveResult > 0) {
            return "redirect:/board/";
        } else {
            return "board/save";
        }

    }
}
