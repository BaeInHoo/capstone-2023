package com.example.demo.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

/*
 * VideoData Table 이다
 * PK는 @param vid_id 이다
 *
 * created on 2023/11/11
 * */
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class VideoData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String vid_id;

    @Id
    @OneToOne
    @JoinColumn(name = "ACC_NO")
    private AccidentResult acc_result;

    @NotNull
    private String vid_path;

    private Integer vid_size;

    private String vid_format;
}
