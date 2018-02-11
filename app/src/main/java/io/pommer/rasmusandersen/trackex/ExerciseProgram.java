package io.pommer.rasmusandersen.trackex;

import io.realm.RealmList;
import io.realm.annotations.PrimaryKey;

/**
 * Created by Rasmus on 11-02-2018.
 */

public class ExerciseProgram {
    @PrimaryKey
    private int id;

    private String name;
    private RealmList<ExerciseRepeats> exercises;

}
