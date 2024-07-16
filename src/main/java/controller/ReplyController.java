package controller;

import model.BoardDTO;
import model.ReplyDTO;

import java.util.ArrayList;

public class ReplyController {
    ArrayList<ReplyDTO> list = new ArrayList<>();
    private int nextId;

    public ReplyController () {
        list= new ArrayList<>();
        nextId=1;
    }

    public void insert(ReplyDTO replyDTO) {
        replyDTO.setId(nextId++);
        list.add(replyDTO);
    }

    public void update(ReplyDTO replyDTO) {

        list.set(list.indexOf(replyDTO),replyDTO);
    }

    public void delete(int id) {
        ReplyDTO replyDTO= new ReplyDTO();
        replyDTO.setId(id);
        list.remove(replyDTO);
    }

    public ArrayList<ReplyDTO> SelectAll() {
        return list;
    }
    // update(), delete()


}