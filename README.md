<!--suppress HtmlDeprecatedAttribute, CheckImageSize -->

<img alt="Auto Enchanter Cover" src="https://github.com/user-attachments/assets/877fd04f-f5ad-4bec-8ff8-e8c0008a4dd0" />

> [!WARNING]
> Experimental mod, use at your own risk

---

<h1 align="center">
    <img src="https://github.com/user-attachments/assets/d8b694df-ffb2-4ce0-abbe-fcd50a8fcc98" alt="Auto Enchanter Icon" align="center">
    AutoEnchanter
    <img src="https://github.com/user-attachments/assets/ba75f125-a47f-4b4b-a667-77f183285895" alt="Enchanted Book" align="center">
</h1>

Enchant items in the anvil automatically with minimal cost

* <img src="https://gxlg.github.io/multi-version.svg" height="24" width="24" align="center" alt="MultiVersion"> MultiVersion <kbd>1.20.5</kbd>-<kbd>1.21.10</kbd>: Single JAR for all versions
* Purely <kbd>client side</kbd>: works in Singleplayer, in Multiplayer and doesn't have to be installed on Servers

---

<h1 align="center">
    <img src="https://github.com/user-attachments/assets/ba75f125-a47f-4b4b-a667-77f183285895" alt="Enchanted Book" align="center">
    Usage<img src="https://github.com/user-attachments/assets/ba75f125-a47f-4b4b-a667-77f183285895" alt="Enchanted Book" align="center">
</h1>

1. Open an anvil
2. Click on the <kbd>Select</kbd> button; to cancel selection, press <kbd>Cancel</kbd>
3. First select the target item (will be highlighted blue)
4. Then select all the sacrifices you want to make (highlighted green)
5. Once you selected everything, press the <kbd>Calculate</kbd> button
6. Auto Enchanter will check for any incompatible enchantments and start to iterate all possibilities to apply the enchantments
    * Even if you close the anvil screen, the calculation will continue
    * To stop, either press <kbd>Cancel</kbd> inside the anvil screen or use the client-side command `/autoenchanter cancel`
    * Note, that the calculation uses a lot of resources and the speed depends on your hardware
    * Even with a decent setup, only up to 14 items can be calculated in under 5 minutes
7. When the calculation process is finished, Auto Enchanter will notify you
    * If you are in the anvil screen, you will see the message written there
    * Else, you will get a text message in the chat
8. After opening the anvil again, you can choose between <kbd>Start enchanting</kbd> and <kbd>Cancel</kbd>
9. Automatic enchanting works by simulating slot clicks, most servers should allow this
    * If your anvil breaks while enchanting, or you close the anvil screen yourself,
      you can simply re-open an anvil and press <kbd>Start enchanting</kbd> again
    * it will continue from where it left off

<table align="center">
    <tr>
        <td>
            <table>
                <tr><td><img src="https://github.com/user-attachments/assets/16c659bd-b58c-4668-97d7-75d5060c6043" alt="Selection" width="320"></td></tr>
                <tr><td><b>Selecting items for enchanting</b></td></tr>
            </table>
        </td>
        <td>
            <table>
                <tr><td><img src="https://github.com/user-attachments/assets/59f3a0de-b7ca-4d89-bae5-fa5fab4142b9" alt="Ready" width="320"></td></tr>
                <tr><td><b>Success message</b></td></tr>
            </table>
        </td>
    </tr>
    <tr>
        <td colspan="2" align="center">
            <table>
                <tr><td><img src="https://github.com/user-attachments/assets/5bdd73db-4042-4de7-917f-b9cc65d9e2e1" alt="Calculation" width="600"></td></tr>
                <tr><td><b>Calculation process with visualization</b></td></tr>
            </table>
        </td>
    </tr>
</table>

---

<h1 align="center">
    <img src="https://github.com/user-attachments/assets/ba75f125-a47f-4b4b-a667-77f183285895" alt="Enchanted Book" align="center">
    Enchantment Combinations<img src="https://github.com/user-attachments/assets/ba75f125-a47f-4b4b-a667-77f183285895" alt="Enchanted Book" align="center">
</h1>

If your selected items contain **incompatible enchantments**, the mod decides which to keep based on the list of
enchantments on the target item. For every pair of enchantments, that is incompatible, the enchantment which is also
applied to the target item, will be kept, while the other one will be ignored. If not all conflicts could have been
resolved, the calculation process is not started and an error will appear.

Sometimes you can't just enchant using max-level books. Either you don't yet have the required books,
you are enchanting with Wind Burst, or you are playing with the Villager Trades Re-Balance.
Auto Enchanter takes care of such scenarios, and considers the **book levels** when calculating all the orders,
to ensure that the **highest achievable level** is reached.

Auto Enchanter also supports books and items with **multiple enchantments**, adjusting its calculation algorithm
to consider only valid combinations. This process is a little fragile and is still being tested. When there are
wasted or inefficiently used books, Auto Enchanter should throw an error before calculating in most cases, however
sometimes if the combination of the books is more complex, Auto Enchanter will begin calculating and won't find any
fitting enchantment trees.

<h1 align="center">
    <img src="https://github.com/user-attachments/assets/ba75f125-a47f-4b4b-a667-77f183285895" alt="Enchanted Book" align="center">
    Error Messages<img src="https://github.com/user-attachments/assets/ba75f125-a47f-4b4b-a667-77f183285895" alt="Enchanted Book" align="center">
</h1>

> Some items are incompatible or useless

Incompatible enchantments were found and some books contain no useful enchantments

> Enchantment &lt;...&gt; has wasted items

This enchantment has books and items of different levels, and they don't add up to the max level

> Some items' every enchantment is ignored

After adding all incompatible enchantments into the ignore list, some items have no useful enchantments anymore

> Some items' every enchantment is wasted

After creating the merge tree of the different levels of an enchantment,
some items' every enchantment will be wasted in the enchanting process

> Couldn't find a tree

Since not all edge cases can be eliminated before the calculation,
there are additional checks inside the algorithm to discard invalid enchanting orders;
if all such orders were invalid, this error message appears

<h2 align="center">
    <img src="https://github.com/user-attachments/assets/ba75f125-a47f-4b4b-a667-77f183285895" alt="Enchanted Book" align="center" height="42">
    About Me<img src="https://github.com/user-attachments/assets/ba75f125-a47f-4b4b-a667-77f183285895" alt="Enchanted Book" align="center" height="42">
</h2>

I am a computer science student in Germany and have a part-time job at a tech company.
Apart from that, I enjoy my free time by spending it with friends, chatting online or gaming.

If you want to keep this project alive, found it helpful or just want to support and motivate me to go on,
you could consider making a small [<kbd>☕ donation</kbd>](https://www.paypal.com/donate?hosted_button_id=DVC2UQP2AXR68).
