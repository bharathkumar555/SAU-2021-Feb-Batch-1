import React, { useEffect, useState } from "react";
import { ImageBackground,Text,TextInput,StyleSheet,View, Button } from "react-native";
import AsyncStorage from "@react-native-community/async-storage";
//import PasswordInputText from 'react-native-hide-show-password-input';

const image1 = {uri: "https://image.freepik.com/free-vector/white-abstract-background-theme_23-2148827268.jpg"};
const image2  = {uri: "https://previews.123rf.com/images/scenery1/scenery11804/scenery1180400457/100119045-bokeh-white-background-color-christmas-and-new-year-theme-background.jpg"};

const userLogin = ({navigation}) => {
    const [userName,setUserName] = useState("");
    const [password,setPassword] = useState(""); 

    const saveData = async () => {
        try {
          await AsyncStorage.setItem("user", userName)
          alert('Username  successfully saved')
          navigation.navigate("Add And List Notes")

        } catch (e) {
          alert('Failed to save the data to the storage')
        }
      }

    const logged = () => {
        if(userName != "Bharath" || password !="Bharath@123"){
            alert("Please enter correct credentials");
            return;
        }
        saveData();
        
        console.log(userName);
    }

    return (
        <View style={styles.container}>
            
    <ImageBackground source={image2} style={styles.image}>
    
            <Text style={styles.loginTextStyle}>
               User Login
            </Text>
            <TextInput placeholder="Enter Username" onChangeText={ (text) => setUserName(text)} style={styles.textInputStyle} />
            <Text></Text>
            <TextInput placeholder="Enter Password" onChangeText={ (text) => setPassword(text)} style={styles.textInputStyle} />
            <Button title="Login" color="blue"  onPress={logged} />
            </ImageBackground>
        </View>  
    )

}

const styles = StyleSheet.create({
    container: {
        justifyContent: "center",
        alignItems: "center",
        flex: 1
    },
    image: {
        flex: 1,
        width:"100%",
        resizeMode: "cover",
        justifyContent: "center"
      },
    loginTextStyle: {
        fontSize: 40,
        fontWeight: "700",
        marginLeft:60,
        marginVertical: 20
    },
    textInputStyle: {
        borderColor: "blue",
        borderWidth: 1,
        borderRadius: 5,
        fontSize: 20,
        marginLeft:60,
        padding: 5,
        width: "60%",
        textAlign:"center"
    },
    error:
    {
        color:"red",
        marginBottom: 20,

    }
})

export default userLogin;
