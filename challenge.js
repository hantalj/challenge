function deCipher(partC, number){
    let result = '';
    for (let i = 0; i<partC.length; i++)
        if( partC[i].toUpperCase() != partC[i].toLowerCase() ){
            let asciiCode = partC.charCodeAt(i)-number
            if (asciiCode<97)
                asciiCode +=26;
            result+=String.fromCharCode(asciiCode);
        }
        else if(partC[i]==",")
            result+=":";
        else if(partC[i]=="+")
            result+=".";
        else if(partC[i]=="?")
            result+="/";
        
    return result;
}    
let part1 = "k12ww 7s49v ,?286?mv 27rq s33od4 6fh77k r4og2 hu+";
let part2 = "yd23 un394 hti58 j934+0 67htr9 8?173h t23r96 rj8s3 y73x";
resultString = deCipher(part1,3)+deCipher(part2,5);
console.log(resultString);