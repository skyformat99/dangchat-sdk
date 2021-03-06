package im.actor.core.api.updates;
/*
 *  Generated by the Actor API Scheme generator.  DO NOT EDIT!
 */

import im.actor.runtime.bser.*;
import im.actor.runtime.collections.*;
import static im.actor.runtime.bser.Utils.*;
import im.actor.core.network.parser.*;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import com.google.j2objc.annotations.ObjectiveCName;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import im.actor.core.api.*;

public class UpdateContactsRemoved extends Update {

    public static final int HEADER = 0x29;
    public static UpdateContactsRemoved fromBytes(byte[] data) throws IOException {
        return Bser.parse(new UpdateContactsRemoved(), data);
    }

    private List<Integer> uids;

    public UpdateContactsRemoved(@NotNull List<Integer> uids) {
        this.uids = uids;
    }

    public UpdateContactsRemoved() {

    }

    @NotNull
    public List<Integer> getUids() {
        return this.uids;
    }

    @Override
    public void parse(BserValues values) throws IOException {
        this.uids = values.getRepeatedInt(1);
    }

    @Override
    public void serialize(BserWriter writer) throws IOException {
        writer.writeRepeatedInt(1, this.uids);
    }

    @Override
    public String toString() {
        String res = "update ContactsRemoved{";
        res += "uids=" + this.uids.size();
        res += "}";
        return res;
    }

    @Override
    public int getHeaderKey() {
        return HEADER;
    }
}
