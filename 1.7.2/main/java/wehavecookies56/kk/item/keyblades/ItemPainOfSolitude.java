package wehavecookies56.kk.item.keyblades;

import java.util.List;

import mods.battlegear2.api.weapons.IBattlegearWeapon;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.world.World;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import wehavecookies56.kk.KingdomKeys;
import wehavecookies56.kk.lib.ConfigBooleans;
import wehavecookies56.kk.lib.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemPainOfSolitude extends ItemSword implements IBattlegearWeapon{
	public static boolean keyPressed = false;
	public static boolean keyHasBeenPressed = false;
    public ItemPainOfSolitude(ToolMaterial kingdomkey999) {
        super(kingdomkey999);
        this.setCreativeTab(KingdomKeys.KHDAYSTAB);
    }
    public void registerIcons(IIconRegister par1IconRegister) {
        itemIcon = par1IconRegister.registerIcon(Reference.MOD_ID + ":" + this.getUnlocalizedName().substring(this.getUnlocalizedName().indexOf(".")+1));
        }
    @Override
    public boolean hasEffect(ItemStack par1ItemStack){
    	if(ConfigBooleans.enableShine == true){
        return true;
    	}
    	return false;
    }
    @Override
    @SideOnly(Side.CLIENT)
    public EnumRarity getRarity(ItemStack par1ItemStack){
        return EnumRarity.epic;
    }
    
    @SideOnly(Side.CLIENT)
    public void addInformation(ItemStack itemStack, EntityPlayer player, List dataList, boolean bool){
    	dataList.add("Kingdom Hearts 358/2 Days");
    }
    
    public void onUpdate(ItemStack itemstack, World par2World, Entity par3Entity, int par4, boolean par5)
    {
    if(itemstack.isItemEnchanted() == false)
    {
    itemstack.addEnchantment(KingdomKeys.HarvestHearts, 4);
    }
	EntityPlayer player = (EntityPlayer)par3Entity;
	if (this.keyPressed)
	{
		Minecraft.getMinecraft().theWorld.playSoundAtEntity(player, "kk:summon", 1, 0);
		this.keyPressed = false;
	}
    }
	@Override
	public boolean sheatheOnBack(ItemStack item) {
		return true;
	}
	@Override
	public boolean isOffhandHandDual(ItemStack off) {
		return true;
	}
	@Override
	public boolean offhandClickAir(PlayerInteractEvent event,
			ItemStack mainhandItem, ItemStack offhandItem) {
		return true;
	}
	@Override
	public boolean offhandClickBlock(PlayerInteractEvent event,
			ItemStack mainhandItem, ItemStack offhandItem) {
		return true;
	}
	@Override
	public void performPassiveEffects(Side effectiveSide,
			ItemStack mainhandItem, ItemStack offhandItem) {
	}
	@Override
	public boolean allowOffhand(ItemStack mainhand, ItemStack offhand) {
		return true;
	}
	@Override
	public boolean offhandAttackEntity(
			mods.battlegear2.api.PlayerEventChild.OffhandAttackEvent event,
			ItemStack mainhandItem, ItemStack offhandItem) {
		return false;
	}
	
}