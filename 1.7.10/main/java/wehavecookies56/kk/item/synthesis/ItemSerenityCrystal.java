package wehavecookies56.kk.item.synthesis;

import net.minecraft.client.renderer.texture.IIconRegister;
import wehavecookies56.kk.item.ItemKingdomKeys;
import wehavecookies56.kk.lib.Reference;

public class ItemSerenityCrystal extends ItemKingdomKeys{
    public ItemSerenityCrystal() {
        super();       
    }
    public void registerIcons(IIconRegister par1IconRegister) {
        itemIcon = par1IconRegister.registerIcon(Reference.MOD_ID + ":" + this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".")+1));
        }
}