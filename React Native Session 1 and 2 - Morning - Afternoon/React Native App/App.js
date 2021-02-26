import React from "react";
import  { createStackNavigator} from "@react-navigation/stack";
import { NavigationContainer } from "@react-navigation/native";

import Login from "./Components/userLogin";
import Allnotes from "./Components/Allnotes";
import NoteDetails from "./Components/NoteDetails";

const Stack = createStackNavigator();

const App = () => { 
  return (
    <NavigationContainer>
      <Stack.Navigator>
      <Stack.Screen name="User Login" component={Login} />
      <Stack.Screen name="Add And List Notes" component={Allnotes} />
      <Stack.Screen name="Note Details" component={NoteDetails} />
      </Stack.Navigator>
    </NavigationContainer>
  )
}
 
export default App;