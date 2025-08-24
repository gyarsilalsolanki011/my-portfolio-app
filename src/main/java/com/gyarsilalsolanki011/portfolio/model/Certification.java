package com.gyarsilalsolanki011.portfolio.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Certification {
    private String title;
    private String org;
    private String date;
    private String credentialId;
    private String link;
    private String imageUrl;
}
