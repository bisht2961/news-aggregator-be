package com.mrBisht.news_aggregator.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class NewsApiResponse {
    private Integer totalResults;
    private List<Article> articles;
}
