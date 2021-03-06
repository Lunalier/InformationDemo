package com.caimao.information.controller;

import com.caimao.information.common.ResponseEntity;
import com.caimao.information.entity.SortEntity;
import com.caimao.information.service.ISortService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @author: genx
 * @date: 2018/12/14 0:19
 */
@RestController
@RequestMapping("/")
public class SortController {

    @Autowired
    private ISortService sortService;

    @RequestMapping("/sorts")
    public ResponseEntity<List<SortEntity>> sorts() {
        List<SortEntity> list = sortService.getList();
        return ResponseEntity.ok(list);
    }

    @RequestMapping(value="/sort/{id}",method= RequestMethod.GET)
    public SortEntity get(@PathVariable("id") Integer id){
        SortEntity sortEntity = null;
        if(id != null) {
            sortEntity = sortService.getModel(id);
        }
        return sortEntity;
    }

    @RequestMapping(value="/sort",method=RequestMethod.POST)
    public SortEntity post(SortEntity sortEntity){

        return null;
    }

    @RequestMapping(value="/sort/{id}",method=RequestMethod.PUT)
    public SortEntity put(@PathVariable("id") Integer id){
        System.out.println("put"+id);
        return null;
    }

    @RequestMapping(value="/sort/{id}",method=RequestMethod.DELETE)
    public String delete(@PathVariable("id") Integer id){
        System.out.println("delete"+id);
        return "1";
    }
}
