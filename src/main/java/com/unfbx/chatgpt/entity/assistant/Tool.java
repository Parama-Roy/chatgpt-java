package com.unfbx.chatgpt.entity.assistant;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.unfbx.chatgpt.entity.chat.Functions;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;

@Getter
@Slf4j
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
@NoArgsConstructor
@AllArgsConstructor
public class Tool implements Serializable {

    private String type;

    /**
     * type为function时，function参数必输
     */
    private Functions function;


    /**
     * 支持的三种类型
     */
    @Getter
    @AllArgsConstructor
    public enum Type {
        CODE_INTERPRETER("code_interpreter"),
        RETRIEVAL("retrieval"),
        FUNCTION("function"),
        ;
        private final String name;
    }
}
