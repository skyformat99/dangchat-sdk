package im.actor.core.api;
/*
 *  Generated by the Actor API Scheme generator.  DO NOT EDIT!
 */

import im.actor.runtime.bser.*;
import im.actor.core.network.parser.*;
import org.jetbrains.annotations.NotNull;
import java.io.IOException;

public class ApiSearchDataLimit extends ApiSearchCondition {

    private int limit;

    public ApiSearchDataLimit(@NotNull int limit) {
        this.limit = limit;
    }

    public ApiSearchDataLimit() {

    }

    public int getHeader() {
        return 8;
    }

    @NotNull
    public int getLimit() {
        return this.limit;
    }

    @Override
    public void parse(BserValues values) throws IOException {
        this.limit = values.getInt(1);
    }

    @Override
    public void serialize(BserWriter writer) throws IOException {
        writer.writeInt(1, this.limit);
    }

    @Override
    public String toString() {
        String res = "struct SearchDataLimit{";
        res += "limit=" + this.limit;
        res += "}";
        return res;
    }

}
