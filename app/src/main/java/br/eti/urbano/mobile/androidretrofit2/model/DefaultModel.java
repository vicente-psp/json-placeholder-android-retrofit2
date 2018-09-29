package br.eti.urbano.mobile.androidretrofit2.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

/**
 * Created by bruno on 28/09/18.
 */

@Data
@Builder
@AllArgsConstructor
public class DefaultModel {
    private Integer id;
    private String data;
}
