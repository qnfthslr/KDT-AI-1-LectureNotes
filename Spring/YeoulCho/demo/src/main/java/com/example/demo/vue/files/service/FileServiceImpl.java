package com.example.demo.vue.files.service;

import com.example.demo.vue.files.controller.form.FileInfoRequestForm;
import com.example.demo.vue.files.entity.FileTest;
import com.example.demo.vue.files.repository.FilesTestRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
@Slf4j
@Service
@RequiredArgsConstructor
public class FileServiceImpl implements FileService{
    final private FilesTestRepository filesTestRepository;
    @Override
    public Boolean register(List<MultipartFile> fileList, FileInfoRequestForm info){
        try{
            for(MultipartFile multipartFile: fileList){

                String originalFileName = multipartFile.getOriginalFilename();
                log.info("requestFilename: " +multipartFile.getOriginalFilename());
                // src를 기준으로 나와야 하기 때문에 3칸 올라가야함
                // 어차피 나중에 AWS S3로 바꿔야 합니다.
                // 현재 이 기법은 꼼수
                FileOutputStream writer =new FileOutputStream(
                        "../../../Vue/YeoulCho/frontend/src/assets/uploadImgs" +
                                multipartFile.getOriginalFilename()
                );
                writer.write(multipartFile.getBytes());
                writer.close();
                FileTest fileTest = info.toFileTest(originalFileName);
                log.info(originalFileName);
                filesTestRepository.save(fileTest);
                log.info("파일테스트"+fileTest.toString());
            }
        }catch(FileNotFoundException e){
            e.printStackTrace();
            return false;
        }catch(IOException e){
            e.printStackTrace();
            return false;
        }return true;
    }

}
