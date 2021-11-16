package com.cma.aminahsworld;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

    @RequestMapping("/")
    public String displayRoot() {
        return "index";
    }

    @RequestMapping("/home")
    public String displayWelcomePage() {
        return "index";
    }

    @RequestMapping("/explore-work")
    public String displayExploreWorkPage() {
        return "explore-work/explore-work";
    }

    @RequestMapping("/explore-work/grounding")
    public String displayGroundingPage() {
        return "explore-work/grounding";
    }

    @RequestMapping("/explore-work/journeys")
    public String displayJourneysPage() {
        return "explore-work/journeys";
    }

    @RequestMapping("/explore-work/neighborhoods")
    public String displayNeighborhoodsPage() {
        return "explore-work/neighborhoods";
    }

    @RequestMapping("/explore-work/see")
    public String displaySeePage() {
        return "explore-work/see";
    }

    @RequestMapping("/explore-work/the-book")
    public String displayTheBookPage() {
        return "explore-work/the-book";
    }

    @RequestMapping("/artist-bio")
    public String displayArtistBioPage() {
        return "artist-bio";
    }

    @RequestMapping("/rights-restrictions")
    public String displayRightsRestrictionsPage() {
        return "rights-restrictions";
    }

    @RequestMapping("/teach")
    public String displayTeachPage() {
        return "teach";
    }

}


