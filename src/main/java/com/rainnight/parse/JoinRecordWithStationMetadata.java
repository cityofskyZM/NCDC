package com.rainnight.parse;

import com.rainnight.*;
import com.rainnight.TextPair;
import org.apache.hadoop.conf.Configured;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class JoinRecordWithStationMetadata extends Configured {

    public static class JoinRecordMapper extends Mapper<LongWritable,Text,TextPair,Text> {

    }


}
