import { EstagioModule } from './estagio.module';

describe('EstagioModule', () => {
  let estagioModule: EstagioModule;

  beforeEach(() => {
    estagioModule = new EstagioModule();
  });

  it('should create an instance', () => {
    expect(estagioModule).toBeTruthy();
  });
});
