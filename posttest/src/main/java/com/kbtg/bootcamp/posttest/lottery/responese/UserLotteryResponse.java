package com.kbtg.bootcamp.posttest.lottery.responese;


import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserLotteryResponse {

  private List<String> tickets;

  private int count;

  private int cost;

}
