package lk.ijse.manathungatours.dto.tm;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode

public class FinancialTm {
    private String busId;
    private String description;
    private String income;
    private String cost;

}
