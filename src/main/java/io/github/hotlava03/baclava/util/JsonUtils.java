/*
 *    Copyright 2019 HotLava03
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package io.github.hotlava03.baclava.util;

import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;
import com.google.gson.stream.JsonReader;

import java.io.Reader;
import java.io.StringReader;

/**
 * This code does NOT belong to me.
 * https://github.com/AstelonM/LisaX/blob/master/src/main/java/com/lisaxdevelopment/lisax/utils/JsonUtils.java
 */
public class JsonUtils {

    private static JsonParser parser = new JsonParser();

    public static JsonElement parse(String json) throws JsonSyntaxException {
        return parser.parse(new StringReader(json));
    }

    public static JsonElement parse(Reader json) throws JsonIOException, JsonSyntaxException {
        return parser.parse(json);
    }

    public static JsonElement parse(JsonReader json) throws JsonIOException, JsonSyntaxException {
        return parser.parse(json);
    }
}
