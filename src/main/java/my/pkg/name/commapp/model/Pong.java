
package my.pkg.name.commapp.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "pong" })
public class Pong {

    @JsonProperty("pong")
    private Integer pong;

    public Pong(int value) {
        this.pong = value;
    }

    @JsonProperty("pong")
    public Integer getPong() {
        return pong;
    }

    @JsonProperty("pong")
    public void setPong(Integer pong) {
        this.pong = pong;
    }

}