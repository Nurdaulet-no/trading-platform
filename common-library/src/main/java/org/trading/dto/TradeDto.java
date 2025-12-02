package org.trading.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.math.BigDecimal;

@Data
public class TradeDto {
    @JsonProperty("e")
    private String eventType;
    @JsonProperty("E")
    private long eventTime;
    @JsonProperty("s")
    private String symbol;
    @JsonProperty("t")
    private long tradeId;
    @JsonProperty("p")
    private BigDecimal price;
    @JsonProperty("q")
    private BigDecimal quantity;
    @JsonProperty("T")
    private long tradeTime;
    @JsonProperty("m")
    private boolean isBayerMarketMaker;
}
