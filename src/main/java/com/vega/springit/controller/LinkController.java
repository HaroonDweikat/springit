package com.vega.springit.controller;

import com.vega.springit.domain.Link;
import com.vega.springit.repository.LinkRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class LinkController {
    private LinkRepository linkRepository;

    public LinkController(LinkRepository linkRepository){
        this.linkRepository=   linkRepository;
    }
    // list
    @GetMapping("/")
    public List<Link> list() {
        return null;
    }

    // CRUD
    @PostMapping("/create")
    public Link create(@ModelAttribute Link link) {
        return linkRepository.save(link);
    }
    @GetMapping("/{id}")
    public Optional<Link> read(@PathVariable long id ) {
        return linkRepository.findById(id);
    }
    @PutMapping("/{id}")
    public Link update(@PathVariable long id ,@ModelAttribute Link link) {
        return linkRepository.save(link);
    }
    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id) {
        linkRepository.deleteById(id);
    }
}