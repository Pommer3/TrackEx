package io.pommer.rasmusandersen.trackex;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by Rasmus on 11-02-2018.
 */

public class User extends RealmObject {
    @PrimaryKey
    private String email;

    private String username;

}
