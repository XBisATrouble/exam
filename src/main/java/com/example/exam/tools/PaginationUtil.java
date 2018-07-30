package com.example.exam.tools;

import com.example.exam.bean.Pagination;

public class PaginationUtil {
    public static Pagination format(int page, int total,int limit){
        Pagination pagination = new Pagination();
        pagination.setLimit(limit);
        pagination.setPage(page);
        int pages = (total+limit-1)/limit;
        pagination.setPages(pages);
        pagination.setTotal(total);
        pagination.setSelf("/api/questions/"+page);
        int prev = page-1;
        if (prev >=1){
            pagination.setPrev("/api/questions/" + prev);
        }else {
            pagination.setPrev(null);
        }
        int next = page+1;
        if (next <= pages){
            pagination.setNext("/api/questions/" + next);
        }else {
            pagination.setNext(null);
        }

        return pagination;
    }
}
