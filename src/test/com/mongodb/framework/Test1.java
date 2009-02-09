
package com.mongodb.framework;

import java.util.*;
import java.net.*;

import com.mongodb.*;
import com.mongodb.util.*;

public class Test1 {

    public static void main(String[] args) 
        throws UnknownHostException {

        Mongo m = new Mongo( new DBAddress( "127.0.0.1:27017/driver_test_framework" ) );
        DBCollection coll = m.getCollection( "part1" );

        for( int i=0; i<100; i++) {
            DBObject o = new BasicDBObject();
            o.put( "x", i );
            coll.save( o );
        }
    }
}