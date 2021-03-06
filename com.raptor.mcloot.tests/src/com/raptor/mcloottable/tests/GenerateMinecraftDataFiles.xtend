package com.raptor.mcloottable.tests

import com.raptor.mcloottable.util.BooleanProperty
import com.raptor.mcloottable.util.EnumProperty
import com.raptor.mcloottable.util.IntProperty
import com.raptor.mcloottable.util.MinecraftData.Properties
import com.raptor.mcloottable.util.Property
import java.nio.file.Files
import java.nio.file.Paths
import java.util.Collections
import java.util.HashMap
import java.util.Map
import java.util.Set

import static com.raptor.mcloottable.util.MinecraftData.*

class GenerateMinecraftDataFiles {
    
    static val DIR = Paths.get('''C:\Users\flyin\Documents\Xtext\com.raptor.mcloot\src\com\raptor\mcloottable\util\mcdata''')
    
    def static void main(String[] args) {
         
    }
    
    def static generate(Set<String> strings, String fileName) {
        write(fileName, '''
        «FOR element : strings»
            «element»
        «ENDFOR»
        ''')
    }
    
    def static generate(Map<String, Map<String, ? extends Property>> data, String fileName) {
        write(fileName, '''
        «FOR blockEntry : data.entrySet»
            «IF blockEntry.value.isEmpty»
                «blockEntry.key»
            «ELSE»
                «blockEntry.key»
                    «FOR stateEntry : blockEntry.value.entrySet»
                        «stateEntry.key»=«switch value : stateEntry.value {
                            case Properties.HORIZONTAL_FACES: "#HORIZONTAL_FACES"
                            case Properties.ALL_FACES: "#ALL_FACES"
                            case Properties.BLOCK_HALF: "#BLOCK_HALF"
                            case Properties.DOOR_HALF: "#DOOR_HALF"
                            case Properties.BUTTON_FACE: "#BUTTON_FACE"
                            case Properties.INT16: "#INT16"
                            case Properties.STAIR_SHAPE: "#STAIR_SHAPE"
                            case Properties.SLAB_TYPE: "#SLAB_TYPE"
                            case Properties.AXIS: "#AXIS"
                            case Properties.WALL_TYPE: "#WALL_TYPE"
                            case Properties.BED_HALF: "#BED_HALF"
                            case Properties.RAIL_ORIENTATION: "#RAIL_ORIENTATION"
                            case Properties.CHEST_SHAPE: "#CHEST_SHAPE"
                            case Properties.PISTON_STATUS: "#PISTON_STATUS"
                            case Properties.REDSTONE_WIRE_DIRECTION: "#REDSTONE_WIRE_DIRECTION"
                            case Properties.BOOLEAN: "#BOOLEAN"
                            IntProperty: '''#«value.min»..«value.max»'''
                            EnumProperty: value.options.join(" ")
                            default: throw new AssertionError
                        }»
                    «ENDFOR»
            «ENDIF»
        «ENDFOR»
        ''')
    }
    
    def static write(String fileName, String text) {
        Files.write(DIR.resolve(fileName), text.bytes)
    }
    
}
