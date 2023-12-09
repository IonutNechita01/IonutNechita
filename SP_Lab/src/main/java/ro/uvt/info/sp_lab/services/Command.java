package ro.uvt.info.sp_lab.services;

import org.springframework.http.ResponseEntity;


public interface Command<T> {

    T execute();
}
