package br.eti.urbano.mobile.androidretrofit2.model;

import lombok.Builder;
import lombok.Data;

/**
 * Created by bruno on 28/09/18.
 */

@Data
@Builder
public class User extends DefaultModel {

    private String uuid;
    private String userName;
    private byte[] avatar;
}
