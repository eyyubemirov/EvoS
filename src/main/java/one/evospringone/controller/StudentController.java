package one.evospringone.controller;

import lombok.RequiredArgsConstructor;
import one.evospringone.dto.StudentDto;
import one.evospringone.dto.StudentDtoResponse;
import one.evospringone.service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
@RequiredArgsConstructor
public class StudentController {
    private final StudentService service;

    @GetMapping("/getAll")
    public List<StudentDto> getAll() {
        return service.getAllDto();
    }

    @GetMapping("/get/{id}")
    public StudentDto getByID(@PathVariable Long id) {
        return service.getById(id);
    }
    @GetMapping("/getname/{name}")
    public  List<StudentDto> getByName(@PathVariable String name){
        return service.getByName(name);
    }
    @GetMapping("/getfulln")
    public  List<StudentDto> getByNameAndSurname(@RequestBody StudentDtoResponse dtoResponse){
        return service.getByNameAndSurname(dtoResponse);
    }
    @PostMapping("/create")
    public  StudentDto createDto(@RequestBody StudentDto dto){
        return service.createDto(dto);
    }

    @DeleteMapping("delete/{id}")
    public void deleteById(@PathVariable Long id) {
         service.deleteById(id);
    }

    @PutMapping("update/{id}")
    public StudentDto update(@PathVariable Long id, @RequestBody StudentDto dto) {
        return service.update(id, dto);
    }


}
