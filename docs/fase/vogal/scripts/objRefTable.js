const C3 = self.C3;
self.C3_GetObjectRefTable = function () {
	return [
		C3.Plugins.Sprite,
		C3.Plugins.Touch,
		C3.Plugins.Audio,
		C3.Plugins.Touch.Cnds.OnTapGestureObject,
		C3.Plugins.Sprite.Cnds.CompareInstanceVar,
		C3.Plugins.System.Acts.WaitForPreviousActions,
		C3.Plugins.Sprite.Acts.SetAnim,
		C3.Plugins.Sprite.Acts.SetInstanceVar,
		C3.Plugins.System.Cnds.CompareVar,
		C3.Plugins.System.Acts.Wait,
		C3.Plugins.Sprite.Acts.SetVisible,
		C3.Plugins.System.Acts.SetVar,
		C3.Plugins.System.Cnds.Else,
		C3.Plugins.Audio.Acts.Play
	];
};
self.C3_JsPropNameTable = [
	{valor: 0},
	{turn: 0},
	{A: 0},
	{background: 0},
	{E: 0},
	{I: 0},
	{O: 0},
	{U: 0},
	{A_Resposta: 0},
	{E_REsposta: 0},
	{I_Resposta: 0},
	{O_Resposta: 0},
	{U_Resposta: 0},
	{Toque: 0},
	{Áudio: 0},
	{escolha1: 0},
	{acertou: 0},
	{letra: 0}
];

self.InstanceType = {
	A: class extends self.ISpriteInstance {},
	background: class extends self.ISpriteInstance {},
	E: class extends self.ISpriteInstance {},
	I: class extends self.ISpriteInstance {},
	O: class extends self.ISpriteInstance {},
	U: class extends self.ISpriteInstance {},
	A_Resposta: class extends self.ISpriteInstance {},
	E_REsposta: class extends self.ISpriteInstance {},
	I_Resposta: class extends self.ISpriteInstance {},
	O_Resposta: class extends self.ISpriteInstance {},
	U_Resposta: class extends self.ISpriteInstance {},
	Toque: class extends self.IInstance {},
	Áudio: class extends self.IInstance {}
}