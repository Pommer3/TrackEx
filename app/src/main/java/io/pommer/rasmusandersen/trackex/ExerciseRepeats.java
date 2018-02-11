package io.pommer.rasmusandersen.trackex;

import io.realm.RealmList;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by Rasmus on 11-02-2018.
 */

public class ExerciseRepeats extends RealmObject {

    @PrimaryKey
    private int id;

    private int repetitions;
    private Exercise exercise;

}
