package jp.co.itamura.JenkinsProject.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class JenkinsDto {

    private String name;
    private Integer birthyear;
    private Boolean studentflg;
    private String address;

}
