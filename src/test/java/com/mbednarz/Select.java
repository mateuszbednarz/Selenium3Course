package com.mbednarz;

/*
<select>
    <option value = "volvo">Volvo</option>
    <option value = "bmw">BMW</option>
    <option value = "mb">Mercedes</option>
    <option value = "audi">Audi</option>
</select>
*/

public class Select
{
    public void select(String visibleText)
    {
        System.out.println("Choose value with text = " + visibleText);
    }

    public void select(int index)
    {
        System.out.println("Choose value with index = " + index);
    }
}
