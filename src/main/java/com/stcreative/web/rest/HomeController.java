package com.stcreative.web.rest;

import com.stcreative.domain.Post;
import com.stcreative.repository.PostRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@Controller
public class HomeController {
    private final PostRepository postRepository;
    private final Logger log = LoggerFactory.getLogger(PostResource.class);

    public HomeController(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @RequestMapping("/")
    public String index(Model model) {
        List<Post> data = postRepository.findAll();
        log.debug("Home Controller" + data.size());

        model.addAttribute("posts", data);

        return "index";
    }
}
