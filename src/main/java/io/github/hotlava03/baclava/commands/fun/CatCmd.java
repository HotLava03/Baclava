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

package io.github.hotlava03.baclava.commands.fun;

import io.github.hotlava03.baclava.commands.Category;
import io.github.hotlava03.baclava.commands.Command;
import io.github.hotlava03.baclava.components.APICallComponent;
import io.github.hotlava03.baclava.events.CommandEvent;

public class CatCmd extends Command {

    CatCmd() {
        this.name = "cat";
        this.aliases = new String[]{"meow"};
        this.description = "Random cats, how cute";
        this.category = Category.FUN;
        this.usage = ">>cat";
    }

    @Override
    public void onCommand(CommandEvent e) {
        new APICallComponent().callAPI(e,"http://aws.random.cat/meow","Meow", "file");
    }
}