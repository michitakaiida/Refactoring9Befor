package Null�I�u�W�F�N�g�̓���_�ȈՔ�;

public abstract class Character
{
    public abstract void Move();
  
    public static void Move(Character character)
    {
        if (character != null)
        {
            character.Move();
        }
    }
}