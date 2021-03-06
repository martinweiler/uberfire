/*
 * Copyright 2016 Red Hat, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.uberfire.ext.layout.editor.client.infra;


public class ColumnResizeEvent {

    private String columnID;
    private String rowID;
    private Direction direction = Direction.LEFT;

    public ColumnResizeEvent( String columnID, String rowID ) {

        this.columnID = columnID;
        this.rowID = rowID;
    }

    public String getRowID() {
        return rowID;
    }

    public String getColumnID() {
        return columnID;
    }

    public ColumnResizeEvent left() {
        this.direction = Direction.LEFT;
        return this;
    }

    public ColumnResizeEvent right() {
        this.direction = Direction.RIGHT;
        return this;
    }

    public boolean isLeft() {
        return direction == Direction.LEFT;
    }

    private enum Direction {
        LEFT, RIGHT;
    }


    public Direction getDirection() {
        return direction;
    }

}
