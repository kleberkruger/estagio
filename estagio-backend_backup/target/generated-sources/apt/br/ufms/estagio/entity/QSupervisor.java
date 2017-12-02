package br.ufms.estagio.entity;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QSupervisor is a Querydsl query type for Supervisor
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QSupervisor extends EntityPathBase<Supervisor> {

    private static final long serialVersionUID = 523442174L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QSupervisor supervisor = new QSupervisor("supervisor");

    public final QUsuario _super;

    public final BooleanPath aprovado = createBoolean("aprovado");

    public final DateTimePath<java.util.Date> aprovadoEm = createDateTime("aprovadoEm", java.util.Date.class);

    //inherited
    public final BooleanPath ativo;

    public final StringPath cargo = createString("cargo");

    //inherited
    public final StringPath cpfCnpj;

    //inherited
    public final DateTimePath<java.util.Date> dataAtualizacao;

    //inherited
    public final DateTimePath<java.util.Date> dataCriacao;

    // inherited
    public final QEndereco endereco;

    //inherited
    public final CollectionPath<EnderecoEletronico, QEnderecoEletronico> enderecosEletronicos;

    public final CollectionPath<FormacaoAcademica, QFormacaoAcademica> formacoesAcademicas = this.<FormacaoAcademica, QFormacaoAcademica>createCollection("formacoesAcademicas", FormacaoAcademica.class, QFormacaoAcademica.class, PathInits.DIRECT2);

    //inherited
    public final NumberPath<Long> id;

    public final StringPath lattesUrl = createString("lattesUrl");

    //inherited
    public final StringPath nacionalidade;

    //inherited
    public final StringPath nome;

    //inherited
    public final NumberPath<Integer> rgNumero;

    //inherited
    public final StringPath rgOrgaoExpedidor;

    //inherited
    public final StringPath senha;

    //inherited
    public final CollectionPath<Telefone, QTelefone> telefones;

    //inherited
    public final EnumPath<br.ufms.estagio.enumerate.TipoPessoa> tipoPessoa;

    //inherited
    public final EnumPath<br.ufms.estagio.enumerate.TipoUsuario> tipoUsuario;

    public QSupervisor(String variable) {
        this(Supervisor.class, forVariable(variable), INITS);
    }

    public QSupervisor(Path<? extends Supervisor> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QSupervisor(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QSupervisor(PathMetadata<?> metadata, PathInits inits) {
        this(Supervisor.class, metadata, inits);
    }

    public QSupervisor(Class<? extends Supervisor> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this._super = new QUsuario(type, metadata, inits);
        this.ativo = _super.ativo;
        this.cpfCnpj = _super.cpfCnpj;
        this.dataAtualizacao = _super.dataAtualizacao;
        this.dataCriacao = _super.dataCriacao;
        this.endereco = _super.endereco;
        this.enderecosEletronicos = _super.enderecosEletronicos;
        this.id = _super.id;
        this.nacionalidade = _super.nacionalidade;
        this.nome = _super.nome;
        this.rgNumero = _super.rgNumero;
        this.rgOrgaoExpedidor = _super.rgOrgaoExpedidor;
        this.senha = _super.senha;
        this.telefones = _super.telefones;
        this.tipoPessoa = _super.tipoPessoa;
        this.tipoUsuario = _super.tipoUsuario;
    }

}

